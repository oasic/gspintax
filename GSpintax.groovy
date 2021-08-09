import groovy.transform.CompileStatic

@CompileStatic
class GSpintax {

    // Returns a random permutation from the given spintax 
    public static String spin(String txt){
        def random = new Random(); 
        if (!txt.contains("{")){ return txt }
        txt.replaceAll(~/\{([^{}]+)}/){ String _, String contents ->
            def choices = contents.split("\\|")
            choices[random.nextInt(choices.length)]
        }
    }

}



