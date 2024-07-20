package src;

public class Squirtle extends Pokemon {

	public String nombre = "Squirtle";

	public Squirtle() {}

	public Squirtle(String nombre, int vida, int ataque, String estado) {
		super(nombre, vida, ataque, estado);
	}

	//Pokemon
	public void mSquirtle() {
		System.out.println(                                                                    
						"                      &&&&%%%%%%##%                            \n" +
						"                   %(%%%%####*%#%#####                         \n" +	
						"                  %#%%###%%#% *@&,###(#                        \n" +
						"                 / %%%#%#%%%.   (&((((((                       \n" +
						"                /%%%###%%%%%%.((&(((((((                       \n" +
						"                ((%##.((*../###(((/(((((                       \n" +
						"                  ((((((((((((((((((((/                        \n" +
					    "                     ##((((((((((((( %&(.                      \n" +
						"                %%%%/%#####,   //%%#(((./(                     \n" +
						"              #%%%%%%%.&&&&&#####%%&&%%##((.//#                \n" +
						"            ((%#%%%%#&&&&&&&,/  .%%%%#%%((((/((,               \n" +
						"          (#((((((((#&&&&&&%(&&%%%%#######/%((##               \n" +
						"                   &&&&&%&&&&&#((((((##*%%&/(#(                \n" +
						"                    &(&(.%&&&&%%%%% %###*%% ///*               \n" +
						"                    .&&&%%%%&%&%%&%%#####%%%///    ###%%%##((  \n" +
						"                  &%%.%%&&&&&&&&%###.%%%%%%# /*  ((((((((((((( \n" +
						"                 &&&%%#/###*/#####%%%%%%%%%%( (((((((((((((((( \n" +
						"                 %%%##((((########,%%%%%%%%%# (((((((((((((((( \n" +
					    "                 ##(((((((          ##%#%%%#(.(((((((((,((((   \n" +
						"                /#(#(((             ,((((((((                  \n" +
						"                                     #(((#(((#                 \n" 
						);
		
						System.out.println(" - Nombre:    " + nombre);
						System.out.println(" - Vida:      " + getVida());
						System.out.println(" - Ataque:    " + getAtaque());
						System.out.println(" - Estado:    " + getEstado());	
	}
}