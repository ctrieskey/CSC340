package query;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class QueryManager {

	public static Query createQuery(String make, String model, String year, LocalDateTime date) {
		return new Query(make, model, year, LocalDateTime.now());
	}

	public static ArrayList<Query> findQuery(String make, String model, String year, LocalDateTime date) {
		ArrayList<Query> q = new ArrayList<Query>();

		for(int i=0; i<q.size(); i++) {
			if(	(make != null && make != q.get(i).getMake()) || 
				(model != null && model != q.get(i).getModel())||
				(year != null && year != q.get(i).getYear()) ||
				(date != null && date != q.get(i).getDate())) {
				q.remove(i);
			}
		}
		
		return q;
	}
	
}
