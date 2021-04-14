package at.htl;

import at.htl.at.htl.model.Game;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/bg-api/game")
public class BoardGameResource {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Game> games() {
        return List.of(
                new Game("new Game 1", "game maker", "Action",-1),
                new Game("new Game 2", "game maker", "Action",-1));
    }

}
