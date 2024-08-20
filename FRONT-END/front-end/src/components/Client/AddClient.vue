<template>
  <div class="container mt-4">
    <h2>Add a New Client</h2>
    <form @submit.prevent="addClient">
      <div class="form-group">
        <label for="name">First name:</label>
        <input type="text" class="form-control" id="name" v-model="clientData.firstName" required>
      </div>
      <div class="form-group">
        <label for="lastName">Last Name:</label>
        <input type="text" class="form-control" id="lastName" v-model="clientData.lastName" required>
      </div>
      <div class="form-group">
        <label for="phone">Phone Number:</label>
        <input type="text" class="form-control" id="phone" v-model="clientData.phoneNumber" required>
      </div>
      <div class="form-group">
        <label for="address">Address:</label>
        <textarea class="form-control" id="address" v-model="clientData.address" rows="3" required></textarea>
      </div>

      <button type="submit" class="btn btn-primary mt-3">ADD</button>
    </form>
  </div>
</template>

<script>
import axios from 'axios';

export default {
  name: "AddClient-page",
  data() {
    return {
      clientData: {
        firstName: '',
        lastName: '',
        phoneNumber: '',
        address: '',

      }
    };
  },
  methods: {
    addClient() {
      axios.post('http://localhost:8080/Client', this.clientData)
          .then(response => {

            console.log('Le client a été ajouté avec succès:', response.data);

          })
          .catch(error => {
            console.error('Une erreur s\'est produite lors de l\'ajout du client:', error);
          });
    }
  }
};
</script>
