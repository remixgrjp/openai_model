# Models in OpenAI
To get list of model in OpenAI by simple-openai.

## Environment
AlmaLinux release 8.8 (Sapphire Caracal)

openjdk 11.0.22 2024-01-16 LTS

OpenJDK Runtime Environment (Red_Hat-11.0.22.0.7-1) (build 11.0.22+7-LTS)

OpenJDK 64-Bit Server VM (Red_Hat-11.0.22.0.7-1) (build 11.0.22+7-LTS, mixed mode, sharing)

Apache Maven 3.9.6

https://github.com/sashirestela/simple-openai 
## Usage

```
git clone https://github.com/remixgrjp/openai_model.git
cd openai_model
mvn clean compile
mvn exec:java -Dexec.mainClass=jp.example.App
```

2024-05-06 NOW

```
2023-08-22 01:16:55,model,system         ,babbage-002
2023-11-01 09:22:57,model,system         ,dall-e-2
2023-11-01 05:46:29,model,system         ,dall-e-3
2023-08-22 01:11:41,model,system         ,davinci-002
2023-03-01 03:56:42,model,openai         ,gpt-3.5-turbo
2024-01-24 07:19:18,model,system         ,gpt-3.5-turbo-0125
2023-03-01 02:52:43,model,openai         ,gpt-3.5-turbo-0301
2023-06-13 01:30:34,model,openai         ,gpt-3.5-turbo-0613
2023-11-03 06:15:48,model,system         ,gpt-3.5-turbo-1106
2023-05-11 07:35:02,model,openai-internal,gpt-3.5-turbo-16k
2023-05-31 04:17:27,model,openai         ,gpt-3.5-turbo-16k-0613
2023-08-25 03:23:47,model,system         ,gpt-3.5-turbo-instruct
2023-09-08 06:34:32,model,system         ,gpt-3.5-turbo-instruct-0914
2023-06-28 01:13:31,model,openai         ,gpt-4
2024-01-24 04:20:12,model,system         ,gpt-4-0125-preview
2023-06-13 01:54:56,model,openai         ,gpt-4-0613
2023-11-03 05:33:26,model,system         ,gpt-4-1106-preview
2024-03-27 02:10:33,model,system         ,gpt-4-1106-vision-preview
2024-04-06 08:57:21,model,system         ,gpt-4-turbo
2024-04-09 03:41:17,model,system         ,gpt-4-turbo-2024-04-09
2024-01-24 04:22:57,model,system         ,gpt-4-turbo-preview
2023-11-02 12:15:17,model,system         ,gpt-4-vision-preview
2024-01-23 04:53:00,model,system         ,text-embedding-3-large
2024-01-23 03:43:17,model,system         ,text-embedding-3-small
2022-12-17 04:01:39,model,openai-internal,text-embedding-ada-002
2023-04-20 06:49:11,model,openai-internal,tts-1
2023-11-04 08:14:01,model,system         ,tts-1-1106
2023-11-04 06:13:35,model,system         ,tts-1-hd
2023-11-04 08:18:53,model,system         ,tts-1-hd-1106
2023-02-28 06:13:04,model,openai-internal,whisper-1
```

