<template>
  <div>

    <section class="vh-100">
      <div class="container-fluid h-custom">
        <div class="row d-flex justify-content-center align-items-center h-100">
          <div class="col-md-9 col-lg-6 col-xl-5">
            <img src="https://mdbcdn.b-cdn.net/img/Photos/new-templates/bootstrap-login-form/draw2.webp"
                 class="img-fluid" alt="Sample image">

          </div>
          <div class="col-md-8 col-lg-6 col-xl-4 offset-xl-1">
            <!-------- Start form ------->
            <h1>Login</h1>
            <form @submit.prevent="login">
              <!-- Email input -->
              <div class="form-outline mb-4">
                <label class="form-label" >Email address</label>
                <input type="email" v-model="email" required  class="form-control form-control-lg"
                       placeholder="Enter a valid email address" />

              </div>

              <!-- Password input -->
              <div class="form-outline mb-3">
                <label class="form-label" >Password</label>
                <input type="password"  v-model="password" required  class="form-control form-control-lg"
                       placeholder="Enter password" />

              </div>

              <div class="d-flex justify-content-between align-items-center">
                <!-- Checkbox -->
                <div class="form-check mb-0">
                  <!--input class="form-check-input me-2" type="checkbox" value="" id="form2Example3" /-->
                  <label class="form-check-label" for="form2Example3">
                   <div v-if="errorMessage" class="error-message">
                     {{errorMessage}}
                   </div>
                  </label>
                </div>
                <a href="#!" class="text-body">Forgot password?</a>
              </div>

              <div class="text-center text-lg-start mt-4 pt-2">
                <button type="submit" class="btn btn-primary btn-lg"
                        style="padding-left: 2.5rem; padding-right: 2.5rem;">Login</button>
                <p class="small fw-bold mt-2 pt-1 mb-0">Don't have an account?
                  <a href="#!" class="link-danger">Register</a></p>
              </div>

            </form>

            <!-------- end form ------->

          </div>
        </div>
      </div>
      <div
          class="d-flex flex-column flex-md-row text-center text-md-start justify-content-between py-4 px-4 px-xl-5 bg-primary">
        <!-- Copyright -->
        <div class="text-white mb-3 mb-md-0">
         PFE 2023.
        </div>
        <!-- Copyright -->

        <!-- Right -->

        <!-- Right -->
      </div>
    </section>
  </div>
</template>

<script>
import axios from "axios";
export default {
  name: "LoginClient-page",

  data() {
    return {
      email: '',
      password: '',
      errorMessage:'',
    };
  },
  methods: {
    login() {
      const loginData = {
        email: this.email,
        password: this.password,
      };


      axios.post('http://localhost:8080/Client/login', loginData)
          .then((response) => {

            console.log('login successful!', response.data);
            localStorage.setItem('client',JSON.stringify(response.data));
            localStorage.setItem('loggedIn', true);
            this.$router.push('/Orders');
          })
          .catch((error) => {
            console.error('login failed:', error);
            this.errorMessage='login failed';
          });
    },
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
.error-message{
  color: red;
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