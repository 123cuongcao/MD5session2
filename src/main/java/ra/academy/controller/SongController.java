package ra.academy.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ra.academy.model.FormRequest;
import ra.academy.repository.IMusicRepository;
import ra.academy.repository.ISongRepository;

import java.awt.print.Pageable;

@Controller
@RequestMapping
@RequiredArgsConstructor
public class SongController {
    private ISongRepository repository;
    private IMusicRepository iMusicRepository;

    @RequestMapping("")
    public String add(Model model){
        model.addAttribute("FormRequest",new FormRequest());
        return "/addForm";
    }

    @RequestMapping("/list")
    public String doAdd(Pageable pageable, @RequestParam("name") String name, Model model){
        iMusicRepository.findMusicBySongNameContaining(name,pageable);
        model.addAttribute("list",  iMusicRepository.findMusicBySongNameContaining(name,pageable));
        return "/list";

    }
}
