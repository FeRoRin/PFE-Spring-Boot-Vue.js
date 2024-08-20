<template>
  <div>
    <h1>Welcome <b class="name-cl">{{ client.firstName }}</b> To Product List  </h1>
    <div>
      <p><strong>Email:</strong> {{ client.email }}</p>
      <p><strong>Now you are in Order ID :</strong> {{ orderId }}</p>
    </div>
    <!--button @click="logout">LogOut</button-->
    <div class="d-sm-flex align-items-center justify-content-between mb-4">


      <button class="d-none d-sm-inline-block btn btn-sm btn-fero  shadow-sm" @click="getbackToOreder()">

        Get back to list Orders </button>
      <button class="d-none d-sm-inline-block btn btn-sm btn-fero shadow-sm" @click="relaodPage()">

        Reload </button>
      <button class="d-none d-sm-inline-block btn btn-sm btn-fero shadow-sm" @click="seeSuppliers()">

        Suppliers </button>
    </div>
    <div class="card shadow mb-4">
      <div class="card-header py-3">
        <h6 class="m-0 font-weight-bold txt-fero">All Products </h6>
      </div>
      <div class="card-body">
        <div class="table-responsive">
          <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
            <thead>
            <tr>
              <th>ID</th>
              <th>Name</th>
              <th>Price</th>
              <th>stock quantity</th>
              <th>supplier ID</th>
              <th>number of items</th>
              <th>ADD</th>
            </tr>
            </thead>
            <tfoot>
            <tr>
              <th>ID</th>
              <th>Name</th>
              <th>Price</th>
              <th>stock quantity</th>
              <th>supplier ID</th>
              <th>number of items</th>
              <th>ADD</th>

            </tr>
            </tfoot>
            <tbody>
            <tr v-for="product in products" :key="product.id">
              <th scope="row">{{ product.id }}</th>
              <td>{{ product.nom }}</td>
              <td>{{ product.prix }}</td>
              <td>
                {{ product.quantite_stock }}
              </td>
              <td>
                {{ product.fournisseurtIdByProduit }}
              </td>
              <td>
                <input type="number" min="0" step="1" class="form-control" id="numItems" v-model="selectedQuantities[product.id]" required>
              </td>
              <td>
                <button class="btn btn-fero btn-rounded" data-mdb-ripple-color="dark"
                         >ADD </button>
              </td>

            </tr>
            </tbody>
          </table>
        </div>
      </div>
    </div>


    <!-- end table-->
  </div>
</template>

<script>

import axios from "axios";

export default {
  name: "ProductList-page",
  data() {
    return {
      client: {},
      orderId: '', // LocalStorage
      products:[],
      order:{},
      selectedQuantities: {},
    };
  },

  created() {
    const clientData = JSON.parse(localStorage.getItem('client'));
    if (clientData) {
      this.client = clientData;
    }
    // Get back LocalStorage
    const orderId = JSON.parse(localStorage.getItem('selectedOrderId'));
    if (orderId) {
      this.orderId = orderId;
    }

  },
  methods: {

    retrieveProductList() {
      if (this.orderId) {

        axios.get(`http://localhost:8080/Produit`)
            .then((response) => {
              this.products = response.data;
            })
            .catch((error) => {
              console.error(error);
            });
      } else {
        console.error('OrderID not fond');
      }
    },
    getbackToOreder()
    {
      this.$router.push("/Orders");
    },
    relaodPage()
    {
      window.location.reload();
    },
    seeSuppliers()
    {
      this.$router.push("/suppliers");
    },


  },

  mounted() {
    this.retrieveProductList();

  },
};
</script>
<style>
.divider:after,
.divider:before {
  content: "";
  flex: 1;
  height: 1px;
  background: #eee;
}
.btn-fero {
  background-color: #791e8d;
  color:#eeeeee;
}
.btn-fero:hover {
   background-color: rgba(128, 32, 148, 0.99);
  color:#eeeeee;
 }
.txt-fero{
  color:#791e8d;
}
.name-cl
{
  color: midnightblue;
  text-transform: uppercase;
}
.h-custom {
  height: calc(100% - 73px);
}
@media (max-width: 450px) {
  .h-custom {
    height: 100%;
  }
}
</style>