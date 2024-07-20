package src;

public class Umbreon extends Pokemon {

	public String nombre = "Umbreon";

	public Umbreon() {}

	public Umbreon(String nombre, int vida, int ataque, String estado) {
		super(nombre, vida, ataque, estado);
	}

	//Pokemon
	public void mUmbreon() {
		System.out.println(
			"      (                                             #            \n" + 
			"      &&&&&&@                                *&&&&&&#            \n" +
			"      /&&&&&&&&@                          .&&&&&&&&&             \n" +
			"       @&&@,,,,,,/                      .,,,,,,,&&&              \n" +
			"        &,,,,,@&&&&(                   @&&&&*,,,,@.              \n" +
			"         @,,&&&&&&&&.                 &&&&&&&&@,,                \n" +  
			"            &&&&&&&&&                @&&&&&&&&@                  \n" +
			"               &&&&&&@      **       &&&&&&@                     \n" + 
			"                  &&&&@&&&&&&&&&&&&@&&&@                         \n" +
			"                     &&&&&&,&&/@&&&&&@                           \n" +  
			"                    &&&&&&@#&&&,&&&&&&@                          \n" +
			"                   ####&&&&&,/,&@&&###&                          \n" +
			"                   %###@@@&&&&&@&#@###&                          \n" +
			"                    &%####@&&&&&#####@@                          \n" +
			"                     @&&&&&&&&&&&&&&&                            \n" +
       		"                         @&&&@&&&@                               \n" +
       		"                        @@@@@@@@@@@                @&            \n" +
       		"                       &&&&&&&&&&&&@           .&&&&             \n" +
       		"                      &&&&&&&&&&&&&&@      ,,,@&&&&@             \n" +
       		"                     &&&&&&&&&&&&&&&&&  %,,,,,,,,&&              \n" +
       		"                    &&&&&&&&&&&&&&&&&&&&&&&&&@,,,,               \n" +
       		"                    &&&&&&&&&@&&&&&&@&&&&&&&&@,@                 \n" +
       		"                    &@&&&&&&&&@&&&&&&&@&&&&&&&@                  \n" +
       		"                   &&&,*&&&&&&&&&&@,@&&@&&&&@                    \n" +
       		"                  @&&&@,@&&&@&&&&&,&&&&&/                        \n" +
       		"                  @,&&&,&&&&&&&&&&@@&&,(                         \n" +
       		"                   @(@&@&&&&&@&&&&&@@@(@                         \n" +
       		"                   @@@@@&&&&&@&&&&@@@@(                          \n" +
			"                  %@&&@@&&&&&.&&&&&@@@&@                         \n" +
			"                 @@&&@&&&&&&  &&&&&&@@&&&@                       \n" 
			);
 
			System.out.println(" - Nombre:       " + nombre);                                      		
			System.out.println(" - Vida:         " + getVida());                                        
			System.out.println(" - Ataque:       " + getAtaque());                                 
			System.out.println(" - Estado:       " + getEstado());
		}
	}