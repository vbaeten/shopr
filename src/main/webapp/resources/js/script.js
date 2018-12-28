function setNavMenuItemActive(navMenuItem){
    $("#nav-menu-items > li > a").removeClass("active");
    switch (navMenuItem) {
        case "home":
            $("#nav-menu-items-home").addClass("active");
            console.log("In Home");
            break;
        case "user":
            $("#nav-menu-items-user").addClass("active");
            console.log("In User");
            break;
        case "shop":
            $("#nav-menu-items-shop").addClass("active");
            console.log("In Shop");
            break;
        case "addproducts":
            $("#nav-menu-items-addproducts").addClass("active");
            console.log("In Add Products");
            break;
        case "shoppingbag":
            $("#nav-menu-items-shoppingbag").addClass("active");
            console.log("In Shoppingbag");
            break;
        default:
            console.log("In Default");
    }
}
