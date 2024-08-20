
  <template>
    <div id="app">

      <nav class="navbar navbar-expand-lg navbar-light bg-light">
        <!-- Container wrapper -->
        <div class="container">
          <!-- Navbar brand -->

            <img
                src="@/assets/logo.png"
                height="80"
                alt="logo"
                style="margin-top: -1px;"
            />
          <!-- Toggle button -->
          <button
              class="navbar-toggler"
              type="button"
              data-mdb-toggle="collapse"
              data-mdb-target="#navbarButtonsExample"
              aria-controls="navbarButtonsExample"
              aria-expanded="false"
              aria-label="Toggle navigation"
          >
            <i class="fas fa-bars"></i>
          </button>

          <!-- Collapsible wrapper -->
          <div class="collapse navbar-collapse" id="navbarButtonsExample">
            <!-- Left links -->
            <ul class="navbar-nav me-auto mb-2 mb-lg-0">
              <li class="nav-item">
                <router-link to="/" class="nav-link">Home</router-link>
              </li>
              <li class="nav-item">
              <router-link to="/about" class="nav-link">About</router-link>
              </li>
              <li class="nav-item">
                <router-link to="/orders" class="nav-link">Orders</router-link>
              </li>
              <li><router-link to="/products" class="nav-link">Products</router-link> </li>
              <li><router-link to="/suppliers" class="nav-link">Suppliers</router-link></li>
            </ul>
            <!-- Left links -->

            <div class="d-flex align-items-center">

                <!--router-link to="/add-client" class="btn btn-link px-3 me-2">Login</router-link-->


                <router-link to="/signup" class="btn btn-primary me-3">Sign up</router-link>

               <!--router-link to="/client/login" class="btn btn-dark px-3 " >LogIn</router-link-->
              <button @click="handleLoginLogout" class="btn btn-dark px-3 ">{{ loginText }}</button>
            </div>
          </div>
          <!-- Collapsible wrapper -->
        </div>
        <!-- Container wrapper -->
      </nav>




      <div class="container mt-3">
        <router-view></router-view>
      </div>
    </div>
  </template>


<script>

export default {

  name: "App",
  components: {},

  data() {
    return {
      loggedIn: false,
      currentPage:'',
    };
  },
  computed: {
    loginText() {
      return this.loggedIn ? 'Logout' : 'Login';
    },
    showLoginButton(){
      return this.currentPage !== 'LoginClient-page';
    }
  },
  created() {

    const storedLoggedIn = localStorage.getItem('loggedIn');
    if (storedLoggedIn) {
      this.loggedIn = JSON.parse(storedLoggedIn);
    }
  },
  methods: {
    handleLoginLogout() {
      if (this.loggedIn) {
        this.logout();

      } else {
        this.$router.push('/login');

      }
    },
    logout() {

      localStorage.removeItem('client');
      this.loggedIn = false;
      localStorage.setItem('loggedIn', JSON.stringify(this.loggedIn));
      this.$router.push('/Orders');
    },
    updateCurrentPage(route)
    {
      this.currentPage =route.name;
    }



  },
};
</script>

<style>
/*
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;

}*/
</style>
