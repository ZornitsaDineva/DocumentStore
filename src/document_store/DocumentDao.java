package document_store;

import org.bson.Document;
import org.bson.conversions.Bson;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;

public class DocumentDao {

	MongoClient mongoClient = new MongoClient();
	MongoDatabase database = mongoClient.getDatabase("Documents");
	MongoCollection<Document> collection = database.getCollection("Docs");

	public Document getDocumentByChecksum(String checksum) {
		Bson filter = Filters.eq("Checksum", checksum);
		Document document = collection.find(filter).first();
		return document;
	}

}