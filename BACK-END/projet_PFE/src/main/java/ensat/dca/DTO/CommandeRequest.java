package ensat.dca.DTO;

import javax.xml.crypto.Data;
import java.util.Date;

public class CommandeRequest {
    private Date date;
    private Integer client_id;


    public CommandeRequest() {
    }

    public CommandeRequest(Date date, Integer client_id) {
        this.date = date;
        this.client_id = client_id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getClient_id() {
        return client_id;
    }

    public void setClient_id(Integer client_id) {
        this.client_id = client_id;
    }
}
