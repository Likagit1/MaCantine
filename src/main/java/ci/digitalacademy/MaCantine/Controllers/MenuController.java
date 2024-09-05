package ci.digitalacademy.MaCantine.Controllers;

import ci.digitalacademy.MaCantine.Models.Menu;
import ci.digitalacademy.MaCantine.Services.MenuService;
import ci.digitalacademy.MaCantine.Services.dto.MenuDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/menus")
@Slf4j
public class MenuController {

    private final MenuService menuService;

    @GetMapping
    public String showMenuPage(Model model) {
        List<MenuDTO> menus = menuService.findAll();
        model.addAttribute("menus", menus);
        return "menus/list";
    }

    @PostMapping
    public String saveMenu(MenuDTO menu){
        log.debug("Request to save menu :{}", menu);
        menuService.save(menu);
        return "redirect:/menus";
    }

    @GetMapping("/add")
    public String showAddMenuPage(Model model) {
        log.debug("Request to show add menu forms");
        model.addAttribute("role", new Menu());
        return "menus/forms";
    }
}