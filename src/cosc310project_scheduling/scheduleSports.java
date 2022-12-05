package cosc310project_scheduling;

import java.io.IOException;
import java.net.http.HttpClient;
import java.util.concurrent.TimeUnit;

import okhttp3.Call;
import okhttp3.Headers;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.http2.Header;

public class scheduleSports{
	
	String[] apiLeagueURLArray = {"","","",""};
	
	public scheduleSports(league l) throws IOException {
		setup();
	}

	private static void setup() throws IOException {
		
		OkHttpClient client = new OkHttpClient.Builder()
			      .readTimeout(1, TimeUnit.SECONDS)
			      .build();
		
		Request request = new Request.Builder()
			      .url("https://v1.american-football.api-sports.io/")
			      .addHeader("x-apisports-key", "95f84fcdfd671980cce4c3b1903b9b18")
			      .build();
		
		Call call = client.newCall(request);
	    Response response = call.execute();
	    
	    System.out.println(response.code());
		
	}
	
}
