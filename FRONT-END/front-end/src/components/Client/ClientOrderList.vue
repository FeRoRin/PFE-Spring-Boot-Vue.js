<template>
  <div>
    <h1>Welcome <b class="name-cl">{{ client.lastName }}</b> to Your Orders List</h1>
    <div>
      <p><strong>Email:</strong> {{ client.email }}</p>
    </div>
    <!--button @click="logout">LogOut</button-->
    <div class="d-sm-flex align-items-center justify-content-between mb-4">
      <!--h1 class="h3 mb-0 text-gray-800">Orders</h1-->
      <button class="d-none d-sm-inline-block btn btn-sm btn-primary shadow-sm" @click="addNewOrder()">
        New Order </button>
      <button class="d-none d-sm-inline-block btn btn-sm btn-primary shadow-sm" @click="relaodPage()">
        Reload </button>

    </div>
    <div class="card shadow mb-4">
      <div class="card-header py-3">
        <h6 class="m-0 font-weight-bold text-primary">Orders</h6>
      </div>
      <div class="card-body">
        <div class="table-responsive">
          <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
            <thead>
            <tr>
              <th>ID</th>
              <th>Invoice</th>
              <th>Date</th>
              <th>Number of products</th>
              <th>UPADTE</th>
              <th>DELETE</th>
              <th>MORE</th>
            </tr>
            </thead>
            <tfoot>
            <tr>
              <th>ID</th>
              <th>Invoice</th>
              <th>Date</th>
              <th>Number of products</th>
              <th>UPADTE</th>
              <th>DELETE</th>
              <th>MORE</th>
            </tr>
            </tfoot>
            <tbody>
            <tr v-for="order in orders" :key="order.id">
              <th scope="row">{{ order.id }}</th>
              <td>50000</td>
              <td>{{ order.date }}</td>
              <td>
                {{count}}
              </td>
              <td> <button class="btn btn-outline-info btn-rounded" data-mdb-ripple-color="dark"
                           @click="updateTOrder(order.id)">Update</button> </td>
              <td>
                <button class="btn btn-outline-danger btn-rounded" data-mdb-ripple-color="dark"
                        @click="deleteOrder(order.id)">Delete</button>
              </td>
              <th>
                <button class="btn btn-outline-primary btn-rounded" data-mdb-ripple-color="dark"
                        @click="redirectToProduct(order.id)">Show Products</button>
              </th>
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
  name: "Oredr-page",
  data() {
    return {
      client: {}, // LocalStorage
      orders:[],
      count:0,
    };
  },

  created() {
    // Get back LocalStorage
    const clientData = JSON.parse(localStorage.getItem('client'));
    if (clientData) {
      this.client = clientData;
    }

  },
  methods: {
    redirectToProduct(orderId) {
      localStorage.setItem("selectedOrderId", orderId);
      this.$router.push("/products_order");
    },

    logout() {
      // Clear LocalStorage
      localStorage.removeItem('client');
      localStorage.setItem('loggedIn', false);
      this.$router.push('/about');
    },
    retrieveOrder() {
      if (this.client) {

        axios.get(`http://localhost:8080/Client/${this.client.id}/Commande`)
            .then((response) => {
              this.orders = response.data;
            })
            .catch((error) => {
              console.error("", error);
            });
      } else {
        console.error('');
      }
    },
    deleteOrder(orderId)
    {
      axios.delete(`http://localhost:8080/Commande/${orderId}`)
          .then((response) => {
            console.log(response);
            window.location.reload();
          })
          .catch((error) => {
            console.error(" delete failed !!! ", error);
          });

    },

    countProduct(orderId)
    {
      axios.get(`http://localhost:8080/Countproduit/${orderId}`)
          .then((response) => {
            this.count = response.data;
          })
          .catch((error) => {
            console.error("", error);
          });
    },

    addNewOrder() {

      const newOrder = {
        date: new Date().toISOString(),
        client_id:this.client.id,
      };

      axios
          .post('http://localhost:8080/NewCommande', newOrder)
          .then(response => {
            console.log(response.data);
          })
          .catch(error => {
            console.error(error);
          });
    },
    updateTOrder(orderId)
    {
      localStorage.setItem("selectedOrderId", orderId);
      this.$router.push("/updateorder");
    },
    relaodPage()
    {
      window.location.reload();
    },

  },

  mounted() {
    this.retrieveOrder();


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