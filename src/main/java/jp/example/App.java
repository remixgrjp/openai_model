package jp.example;

import io.github.sashirestela.openai.BaseSimpleOpenAI;
import io.github.sashirestela.openai.domain.model.Model;
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

			CompletableFuture<List<Model>> futureModels=
				(CompletableFuture<List<Model>>)( openAI.models().getList() );
			List<Model> models= (List<Model>)( futureModels.join() );
			// ORDER BY MODEL ID
			java.util.Collections.sort( models, new java.util.Comparator<Model>(){
				@Override
				public int compare( Model a, Model b ){
					return a.getId().compareTo( b.getId() );
				}
			} );
			for( Iterator it= models.iterator(); it.hasNext(); ){
				Model m= (Model)( it.next() );
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

