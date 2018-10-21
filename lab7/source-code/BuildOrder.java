  

public class BuildOrder {

   
        private static CustomBurger customBurger;
        private static Burger burger;
        private static Cheese cheese;
        private static PremiumCheese pc;
        private static Sauce s;
        private static UnlimitedToppings ut;
        private static PremiumToppings pt;
        private static Bun bun;
        private static Side side;

        public static Component getOrder()
        {
            Composite order = new Composite( "Order" ) ;
    
            /* 
             * First order 
             **/
            customBurger = new CustomBurger( "Build Your Own Burger" ) ;
            
           
            burger = new Burger( "Burger Options" ) ;
            String[] bo = { "Organic Bison*", "1/2lb.", "On A Bun" } ;
            burger.setOptions( bo ) ;
            
           
            cheese = new Cheese( "Cheese Options" ) ;
            String[] co = { "Yellow American", "Spicy Jalapeno Jack" } ;
            cheese.setOptions( co ) ;
            cheese.wrapDecorator( burger ) ;
    
            
            pc = new PremiumCheese( "PremiumCheese Options" );
            String[] pco = { "Danish Blue Cheese" };
            pc.setOptions(pco);
            pc.wrapDecorator( cheese );
    
            
            s = new Sauce( "Sauce Options" ) ;
            String[] so = { "Mayonnaise", "Thai Peanut Sauce" } ;
            s.setOptions( so ) ;
            s.wrapDecorator( pc ) ;
    
           
            ut = new UnlimitedToppings( "UnlimitedToppings Options" );
            String[] uto = { "Black Olives", "Dill Pickle Chips", "Spicy Pickles" };
            ut.setOptions( uto );
            ut.wrapDecorator( s );
    
            
            pt = new PremiumToppings( "PremiumToppings Options" );
            String[] pto = { "Marinated Tomatoes" };
            pt.setOptions( pto );
            pt.wrapDecorator( ut );
    
            
            bun = new Bun( "Bun Option " );
            String[] buno = { "Ciabatta(Vegan)" };
            bun.setOptions( buno );
            bun.wrapDecorator( pt );
    
            
            side = new Side( "Side Option" );
            String[] sideo = { "Shoestring Fries" };
            side.setOptions( sideo );
            side.wrapDecorator( bun );
            
            
            customBurger.setDecorator( side ) ;
            buildBurger(order);
    
    
            /* 
             * Second order 
             **/
            customBurger = new CustomBurger( "Build Your Own Burger" ) ;
            
            
            burger = new Burger( "Burger Options" ) ;
            String[] bo2 = { "Hormone & Antibiotic Free Beef*", "1/3lb.", "On A Bun" } ;
            burger.setOptions( bo2 ) ;
            
            
            cheese = new Cheese( "Cheese Options" ) ;
            String[] co2 = { "Greek Feta", "Smoked Gouda" } ;
            cheese.setOptions( co2 ) ;
            cheese.wrapDecorator( burger ) ;
    
            
            pc = new PremiumCheese( "PremiumCheese Options" );
            String[] pco2 = { "Fresh Mozzarella" };
            pc.setOptions(pco2);
            pc.wrapDecorator( cheese );
    
            
            s = new Sauce( "Sauce Options" ) ;
            String[] so2 = { "Habanero Salsa" } ;
            s.setOptions( so2 ) ;
            s.wrapDecorator( pc ) ;
    
            
            ut = new UnlimitedToppings( "UnlimitedToppings Options" );
            String[] uto2 = { "Crushed Peanuts" };
            ut.setOptions( uto2 );
            ut.wrapDecorator( s );
    
            
            pt = new PremiumToppings( "PremiumToppings Options" );
            String[] pto2 = { "Marinated Tomatoes", "Sunny Side Up Egg*" };
            pt.setOptions( pto2 );
            pt.wrapDecorator( ut );
    
            
            bun = new Bun( "Bun Option " );
            String[] buno2 = { "Gluten-Free Bun" };
            bun.setOptions( buno2 );
            bun.wrapDecorator( pt );
    
            
            side = new Side( "Side Option" );
            String[] sideo2 = { "Shoestring Fries" };
            side.setOptions( sideo2 );
            side.wrapDecorator( bun );
            
           
            customBurger.setDecorator( side ) ;
            buildBurger(order);
            
            return order ;
        }

        private static void buildBurger(Composite order) {
            if (customBurger == null) 
                return;
            customBurger.addChild( burger ) ;
            customBurger.addChild( cheese ) ;
            customBurger.addChild( pc ) ;
            customBurger.addChild( s ) ;
            customBurger.addChild( ut ) ;
            customBurger.addChild( pt ) ;
            customBurger.addChild( bun ) ;
            customBurger.addChild( side ) ;
            if (order != null) 
                order.addChild(customBurger);
            
        }


}


/*

Counter Burger Menu:
https://thecounterburger.emn8.com/?store=Times%20Square

*/