import http from "../http-common";

class CommandeDataService {
    getAll() {
        return http.get("/Commande");
    }
    getAllById() {

        return http.get('/Commande/${ClientId}');
    }
}
export default new CommandeDataService();