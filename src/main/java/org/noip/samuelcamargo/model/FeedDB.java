package org.noip.samuelcamargo.model;

import javax.json.JsonArray;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import com.mongodb.MongoException;
import com.mongodb.ServerAddress;

public class FeedDB {
	private Mongo mongoDatabase = null;

	public Mongo getMongoDatabase() {
		return mongoDatabase;
	}

	public void setMongoDatabase(Mongo mongoDatabase) {
		this.mongoDatabase = mongoDatabase;
	}

	public FeedDB() {
		super();
	}

	public String ConnectToDB() {
		try {
			this.mongoDatabase = new MongoClient(new ServerAddress("localhost", 27017));
			// mongoDatabase = new Mongo("localhost");
			return "Connected to " + this.mongoDatabase.toString();
		} catch (MongoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return e.getMessage();
		}
	}

	public void getCollectionFromDB() {
//		DB db = mongoDatabase.getDB("test");
//
//		System.out.println("Got db");
//
//		BasicDBObject doc = new BasicDBObject();
//
//		doc.put("name", "Michael");
//		doc.put("surname", "Owen");
//		doc.put("age", 31);
//
//		DBCollection coll = db.createCollection("player", doc);
//
//		BasicDBObject career = new BasicDBObject();
//
//		career.put("goals", 100);
//		career.put("matches", 200);
//
//		doc.put("career", career);
//
//		coll.insert(doc);
//		coll.insert(career);
//
//		System.out.println("Inserted DBObject " + coll);
	}

	public void addDocToMongoDB(JsonArray document) {

	}

}