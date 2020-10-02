package com.hightechsoftware.prueba.prueba.rest;

import com.fasterxml.jackson.annotation.JsonView;
import com.hightechsoftware.prueba.prueba.domain.Genero;
import com.hightechsoftware.prueba.prueba.domain.Persona;
import com.hightechsoftware.prueba.prueba.domain.Planeta;
import com.hightechsoftware.prueba.prueba.mapper.Mapper;
import com.hightechsoftware.prueba.prueba.rest.vo.PersonaVO;
import com.hightechsoftware.prueba.prueba.service.PersonaService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT})
@RequestMapping(value = "/api/personas")
public class PersonaController {

    @Autowired
    private PersonaService personaService;
    @Autowired
    Mapper mapper;

    @PostMapping
    @ApiOperation(value = "Servicio encargado de crear personas", notes = "Retorna el objeto persona VO")
    public ResponseEntity<PersonaVO> crearPersona(@RequestBody PersonaVO personaVo ){
       return ResponseEntity.status(HttpStatus.CREATED).body(pasarObjeto(personaVo));
    }

    @GetMapping
    @ApiOperation(value = "Servicio encargado de buscar una persoina por id", notes = "Retorna el objeto persona VO")
    public ResponseEntity<PersonaVO> buscarPersona(@RequestParam(name = "uid", required = false) String uid, @RequestParam(name = "id", required = false) Integer id){
        return ResponseEntity.ok(mapper.map(personaService.buscarPersona(uid,id),PersonaVO.class));
    }

    @PutMapping
    @ApiOperation(value = "Servicio encargado de editar un paciente", notes = "Retorna el objeto persona VO")
    public ResponseEntity<PersonaVO> EditarPaciente(@RequestBody PersonaVO personaVo){
        return ResponseEntity.status(HttpStatus.CREATED).body(pasarObjeto(personaVo));
    }

    @GetMapping("/personas-planeta")
    @ApiOperation(value = "Servicio encargado de buscar un listado de perosnas por id planeta", notes = "Retorna un listado de personas VO")
    public ResponseEntity<List<PersonaVO>> buscarPersonasPorIdPlaneta(@RequestParam Integer idPlaneta){
        return ResponseEntity.ok(mapper.mapAsList(personaService.buscarPersonasPorIdPlaneta(idPlaneta),PersonaVO.class));
    }

    @GetMapping("/planetas")
    @ApiOperation(value = "Servicio encargado de traer el listado de planetas", notes = "Retorna un listado de planetas")
    public ResponseEntity<List<Planeta>> buscarPlanetas(){
        return ResponseEntity.ok(personaService.buscarPlanetas());
    }

    @GetMapping("/generos")
    @ApiOperation(value = "Servicio encargado de traer el listado de generos", notes = "Retorna un listado de generos")
    public ResponseEntity<List<Genero>> buscargeneros(){
        return ResponseEntity.ok(personaService.buscargeneros());
    }

    @PutMapping("/contador-persona")
    @ApiOperation(value = "Servicio encargado agregar una visita a las personas")
    public ResponseEntity<String> editarContadorPersona(@RequestParam Integer idPersona){
       return ResponseEntity.ok(personaService.editarContadorPersona(idPersona));
    }

    @PutMapping("/contador-planeta")
    @ApiOperation(value = "Servicio encargado agregar una visita a los planetas")
    public ResponseEntity<String> editarContadorPlaneta(@RequestParam Integer idPlaneta){
        return ResponseEntity.ok(personaService.editarContadorPlaneta(idPlaneta));
    }

    private PersonaVO pasarObjeto(PersonaVO personaVo){
        Persona persona = mapper.map(personaVo, Persona.class);
        persona = personaService.crearPersona(persona);
        return mapper.map(persona,PersonaVO.class);
    }
}
