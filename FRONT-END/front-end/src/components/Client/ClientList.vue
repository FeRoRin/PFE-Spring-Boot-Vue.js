<template>
  <div>
    <h1>CLIENTS LIST</h1>
    <!-- Add your content here -->
    <div class="list row">

      <div class="my-table">
        <h1>Liste des Clients</h1>
        <table class="table">
          <thead>
          <tr class="table-dark">
            <th scope="col">ID</th>
            <th scope="col">Nom</th>
            <th scope="col">Prenom</th>
            <th scope="col">Telephone</th>
            <th scope="col">Adresse</th>
            <th scope="col">DELETE</th>
          </tr>
          </thead>
          <tbody>
          <tr v-for="client in clients" :key="client.id">
            <th scope="row">{{ client.id }}</th>
            <td>{{ client.firstName }}</td>
            <td>{{ client.lastName }}</td>
            <td>{{ client.phoneNumber }}</td>
            <td>
              {{ client.address }}
            </td>
            <td>
              Delete
            </td>
          </tr>
          </tbody>
        </table>
      </div>

    </div>
  </div>
</template>

<script>


import ClientDataService from "../../services/ClientDataService";

export default {
  name: "Clients-page",
  data() {
    return {
      clients: [],
      currentClient: null,
      currentIndex: -1,
      title: ""
    };
  },
  methods: {
    retrieveClients() {
      ClientDataService.getAll()
          .then(response => {
            this.clients = response.data;
            console.log(response.data);
          })
          .catch(e => {
            console.log(e);
          });
    },
  },
  mounted() {
    this.retrieveClients();
  }
};
/*
import axios from "axios";
export default {
  name: "Clients-page",
  data() {
    return {
      clients: [],
    };
  },
  mounted() {
    this.getClients();
  },
  methods:{
    getClients()
    {
      axios.get('http://localhost:8080/Client').then(response =>{
        this.clients = response.data;
      }).catch(error =>{
        console.error("ERROR !!! ",error);
      });
    }
  }
};*/

</script>
<style>
.list {
  text-align: left;
  max-width: 750px;
  margin: auto;
}
</style>