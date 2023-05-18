package auth.org

import com.test.Sample;

public class BasicAuth extends BaseClass {
	

	public void getStateList() {
		addHeader("accept", "application/josn");

		addBasicAuth("nandhasridhar@gmail.com", "Mrblue45@1");

		//Response response = addReqType("GET", "https://omrbranch.com/api/postmanBasicAuthLogin");

		int statusCode = getStatusCode(response);
		System.out.println(statusCode);

		String resBodyAsString = getResBodyAsString(response);
		System.out.println(resBodyAsString);

		String resBodyAsPrettyString = getResBodyAsPrettyString(response);
		System.out.println(resBodyAsPrettyString);

	}
	

	}
