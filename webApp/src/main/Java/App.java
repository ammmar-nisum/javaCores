@Path("Hello")
public class App{
   @GET
   public String hello = "Hello World";

    @PRODUCES(MediaType.TEXT_PLAIN)
    public String getIt(){
       retrun hello;
   }
}