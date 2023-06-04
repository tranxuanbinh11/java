package tranxuanbinh.net.QLNS.controller;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import tranxuanbinh.net.QLNS.model.NhanVien;
import tranxuanbinh.net.QLNS.service.NhanVienService;
import tranxuanbinh.net.QLNS.service.PhongBanService;

import java.util.List;

@Controller
public class NhanVienController {

    @Autowired
    private NhanVienService service;
    @Autowired
    private PhongBanService phongBanService;

    @GetMapping("/nhanviens")
    public String viewHomePage(Model model) {
        List<NhanVien> listNhanViens = service.listAll();
        model.addAttribute("listNhanvien", listNhanViens);

        return "index";
    }

    @GetMapping("/new")
    public String showNewNhanVienPage(Model model) {
        NhanVien nhanVien = new NhanVien();
        model.addAttribute("nhanvien", nhanVien);
        model.addAttribute("pbs", phongBanService.listAll());

        return "new_nhanvien";
    }

    @PostMapping("/save")
    public String saveNhanVien(@ModelAttribute("nhanvien") NhanVien nhanVien) {
        service.save(nhanVien);
        return "redirect:/nhanviens";
    }


    @GetMapping("/edit/{id}")
    public ModelAndView showEditNhanVienPage(@PathVariable(name = "id") String id) {
        ModelAndView modelAndView = new ModelAndView("edit_nhanvien");
        NhanVien nhanVien = service.get(id);
        modelAndView.addObject("nhanvien", nhanVien);
        modelAndView.addObject("pbs", phongBanService.listAll());
        return modelAndView;
    }

    @PostMapping("/update/{id}")
    public String updateNhanVien(@PathVariable(name = "id") String id, @ModelAttribute("nhanvien") NhanVien nhanVien) {
        NhanVien existingNhanVien = service.get(id);
        existingNhanVien.setTen_nv(nhanVien.getTen_nv());
        existingNhanVien.setGioi_tinh(nhanVien.getGioi_tinh());
        existingNhanVien.setNoi_sinh(nhanVien.getNoi_sinh());
        existingNhanVien.setPhong_ban(nhanVien.getPhong_ban());
        existingNhanVien.setLuong(nhanVien.getLuong());
        service.save(existingNhanVien);
        return "redirect:/nhanviens";
    }

    @GetMapping("/delete/{id}")
    public String deleteNhanVien(@PathVariable(name = "id") String id) {
        service.delete(id);
        return "redirect:/nhanviens";
    }
}
