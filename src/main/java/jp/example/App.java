package jp.example;

import io.github.sashirestela.openai.BaseSimpleOpenAI;
import io.github.sashirestela.openai.domain.model.ModelResponse;
import io.github.sashirestela.openai.SimpleOpenAI;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.concurrent.CompletableFuture;
import java.util.Iterator;
import java.util.List;

/**
 * list of model in OpenAI.
 *
 */
public class App{
	public static void main( String[] a ){
		SimpleDateFormat sdf= new SimpleDateFormat( "yyyy-MM-dd hh:mm:ss" );
		BaseSimpleOpenAI openAI;

		try{
			openAI= SimpleOpenAI.builder()
			.apiKey( System.getenv( "OPENAI_API_KEY" ) )
			.build();

			CompletableFuture futureModels= (CompletableFuture)( openAI.models().getList() );
			List models= (List)( futureModels.join() );
			for( Iterator it= models.iterator(); it.hasNext(); ){
				ModelResponse m= (ModelResponse)( it.next() );
				Timestamp t= new Timestamp( 1000 * m.getCreated() );
				System.out.println( String.format(
					"%s,%s,%-15s,%s", sdf.format( t ), m.getObject(), m.getOwnedBy(), m.getId() ) );
			}
		}catch( Exception e ){
			e.printStackTrace();
		}finally{
		}
	}
}

