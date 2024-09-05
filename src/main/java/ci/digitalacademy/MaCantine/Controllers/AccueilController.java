package ci.digitalacademy.MaCantine.Controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/")
public class AccueilController {

    @GetMapping
    public String showLoginPage(Model model) {
        return "home/dashboard";
    }
}

