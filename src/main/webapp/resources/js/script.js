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
        case "articles":
            $("#nav-menu-items-articles").addClass("active");
            console.log("In Articles");
            break;
        case "shoppingbag":
            $("#nav-menu-items-shoppingbag").addClass("active");
            console.log("In Shoppingbag");
            break;
        case "search":
            $("#nav-menu-items-search").addClass("active");
            break;
        default:
            console.log("In Default");
    }
}
