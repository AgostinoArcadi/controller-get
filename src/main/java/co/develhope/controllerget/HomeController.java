package co.develhope.controllerget;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v2")
public class HomeController {

    @GetMapping("/ciao/{provincia}")
    public Utente viewUtente(
            @PathVariable String provincia,
            @RequestParam String nome
    ) {
        String saluto = "Ciao " + nome + ", com'è il tempo in " + provincia + "?";

        return new Utente(nome, provincia, saluto);
    }

}
