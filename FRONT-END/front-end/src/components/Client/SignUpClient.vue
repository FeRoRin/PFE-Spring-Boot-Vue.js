<template>
  <h1>SignUp</h1>
 <div>
   <form @submit.prevent="submitForm()">
     <!-- 2 column grid layout with text inputs for the first and last names -->
     <div class="row">
       <div class="form-check mb-0">
         <!--input class="form-check-input me-2" type="checkbox" value="" id="form2Example3" /-->
         <label class="form-check-label">
           <div v-if="errorMessage" class="error-message">
             {{errorMessage}}
           </div>
         </label>
       </div>
       <div class="col">
         <!-- First name -->
         <div class="form-outline mb-4">
           <label class="form-label" >First name*</label>
           <input type="text" id="firstName" class="form-control" v-model="clientData.firstName" required />
         </div>

         <!-- Last name -->
         <div class="form-outline mb-4">
           <label class="form-label" >Last name*</label>
           <input type="text" id="lastName" class="form-control" v-model="clientData.lastName" required />
         </div>

         <div class="form-outline mb-4">
           <label class="form-label" >Phone Number*</label>

           <input type="number" id="phoneNumber" class="form-control" v-model="clientData.phoneNumber" required />
         </div>
         <div class="form-outline mb-4">
           <label class="form-label" >Address*</label>

           <input type="text" id="address" class="form-control" v-model="clientData.address" required />
         </div>
       </div>


       <div class="col">
         <!-- Address -->


         <!-- Email -->
         <div class="form-outline mb-4">
           <label class="form-label" >Email*</label>

           <input type="email" id="email" class="form-control" v-model="clientData.email" required />
         </div>

         <div class="form-outline mb-4">
           <label class="form-label" >Create a password*</label>

           <input type="password" id="password" class="form-control" v-model="clientData.password" required />
         </div>

         <div class="form-outline mb-4">
           <label class="form-label" >Repeat password*</label>

           <input type="password" id="repeatPassword" class="form-control" v-model="repeatPassword" required />
         </div>
           <!--textarea class="form-control" id="form6Example7" rows="4"></textarea-->
       </div>
     </div>



     <!-- Submit button -->
     <button type="submit"  class="btn btn-primary btn-block mb-4">Continue Registration</button>
   </form>
 </div>
</template>

<script>

import axios from "axios";

export default {
  name: "SignupClient-page",
  data() {
    return {
      repeatPassword: "",
      errorMessage:'',
      clientData:{
        firstName: "",
        lastName: "",
        phoneNumber: "",
        address: "",
        email: "",
        password: "",
      }
    };
  },
  methods: {
    submitForm() {
      if (
          this.clientData.firstName &&
          this.clientData.lastName &&
          this.clientData.phoneNumber &&
          this.clientData.address &&
          this.clientData.email &&
          this.clientData.password &&
          this.repeatPassword
      ) {

        if(this.clientData.password == this.repeatPassword)
        {
          axios.post('http://localhost:8080/Client', this.clientData)
              .then(response => {

                console.log('Le client a été ajouté avec succès:', response.data);
                localStorage.setItem('signupEmail',JSON.stringify(this.clientData.email));
                //localStorage.setItem('loggedIn', true);
                this.$router.push('/about');

              })
              .catch(error => {
                console.error('Une erreur s\'est produite lors de l\'ajout du client:', error);
              });
        }

      } else {

        alert("please enter correctly!!");
        this.errorMessage='please enter correctly !!';
      }
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
</style>
