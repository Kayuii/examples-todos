package examples;



import io.vertx.blueprint.todolist.verticles.TodoVerticle;
import io.vertx.core.AbstractVerticle;
import io.vertx.core.Future;
import io.vertx.core.Vertx;
import io.vertx.core.logging.Logger;
import io.vertx.core.logging.LoggerFactory;
import io.vertx.ext.web.Router;




public class test extends AbstractVerticle{
	private static final Logger LOGGER = LoggerFactory.getLogger(test.class);
	
	public static void main(String[] args) {
		  Runner.runExample(test.class);
		  //Vertx vertx = Vertx.vertx(options);
		  //runner.accept(vertx);
		  //Vertx vertx = Vertx.vertx();
		  //vertx.deployVerticle(new Server());
	}
	// Convenience method so you can run it in your IDE
	public void start(Future<Void> future) throws Exception {
		Router router = Router.router(vertx);
	    router.route().handler(routingContext -> {
    			routingContext.response().putHeader("content-type", "text/plan").end("Hello World!aaaaaa");
	    });
	    LOGGER.info("Service Start ====>");
	    vertx.createHttpServer().requestHandler(router::accept).listen(8080);
    }
	
	  

//	  @Override
//	  public void start() throws Exception {
//
//	    Router router = Router.router(vertx);
//
//	    router.route().handler(routingContext -> {
//	      routingContext.response().putHeader("content-type", "text/html").end("Hello World!");
//	    });
//
//	    vertx.createHttpServer().requestHandler(router::accept).listen(8080);
//	  }
}
