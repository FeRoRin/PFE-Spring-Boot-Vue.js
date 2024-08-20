<template>
  <div>

    <!--button @click="logout">LogOut</button-->


    <div class="cont">
      <img
          src="@/assets/bg2.jpg"
          height="700"
          alt="logo"

          style="width:100%;"
      />

      <div class="centered">  <h1 class="wlc">Welcome
        <b class="name-cl">{{ client.lastName }}</b> to your space </h1></div>
    </div>
  </div>
</template>

<script>
export default {
  name: "Home-page",
  data() {
    return {
      client: {}, // LocalStorage
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
    logout() {
      // Clear LocalStorage
      localStorage.removeItem('client');
      localStorage.setItem('loggedIn', false);
      this.$router.push('/about');
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
  background: #000;
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
.wlc{
  text-align: center;
}
.cont {
  position: relative;
  color: #000000;
}



/* Centered text */
.centered {
  position: absolute;
  top: 10%;
  left: 50%;
  transform: translate(-50%, -50%);
}

</style>