package document_store;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.bson.Document;

@Path("/DocumentService")
public class DocumentService {
	DocumentDao documentDao = new DocumentDao();

	@GET
	@Path("/check_documents")
	@Produces(MediaType.APPLICATION_JSON)
	public DocumentCheckResponse getDocumentCheckResponse(@QueryParam("checksum") String checksum) {
		Document document = documentDao.getDocumentByChecksum(checksum);

		DocumentCheckResponse checkResponse = new DocumentCheckResponse();
		checkResponse.setChecksumExists(document != null);

		String id = document == null ? null : document.getObjectId("_id").toString();
		checkResponse.setIdOfDuplicatedDocument(id);

		return checkResponse;
	}
}