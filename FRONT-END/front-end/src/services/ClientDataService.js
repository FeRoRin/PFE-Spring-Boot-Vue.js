import http from "../http-common";

class ClientDataService {
    getAll() {
        return http.get("/Client");
    }
}
export default new ClientDataService();