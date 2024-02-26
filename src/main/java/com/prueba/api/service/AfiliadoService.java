package com.prueba.api.service;

import com.prueba.api.model.Afiliado;
import com.prueba.api.repository.AfiliadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Component
public class AfiliadoService {

    @Autowired
    private AfiliadoRepository afiliadoRepository;

    //crear afiliado
    public Afiliado createAfiliado(Afiliado afiliado){
        return afiliadoRepository.save(afiliado);
    }

    //obtener un afiliado por id
    public Afiliado getAfiliadoById(Long id){
        Optional<Afiliado> optionalAfiliado = afiliadoRepository.findById(id);
        return optionalAfiliado.orElseThrow(()-> new NoSuchElementException("No se encontro ningun afiliado"));
    }
    //obtener una lista de afiliados
    public List<Afiliado> getAllAfiliados(){
        return afiliadoRepository.findAll();

    }

    //eliminar un afiliado por id
    public void deleteAfiliado(Long id){
        afiliadoRepository.deleteById(id);
    }

    //actualizar afiliadio
    public Afiliado updateAfiliado(Long id, Afiliado nuevosDatosAfiliado){
        Optional<Afiliado> optionalAfiliado = afiliadoRepository.findById(id);

        if (optionalAfiliado.isPresent()){
            Afiliado afiliadoExistente = optionalAfiliado.get();

            afiliadoExistente.setNombres(nuevosDatosAfiliado.getNombres());
            afiliadoExistente.setApellidos(nuevosDatosAfiliado.getApellidos());
            afiliadoExistente.setFechaNacimiento(nuevosDatosAfiliado.getFechaNacimiento());
            afiliadoExistente.setDireccion(nuevosDatosAfiliado.getDireccion());
            afiliadoExistente.setTelefono(nuevosDatosAfiliado.getTelefono());
            afiliadoExistente.setGenero(nuevosDatosAfiliado.getGenero());

            return afiliadoRepository.save(afiliadoExistente);

        }else {
            throw new NoSuchElementException("No se encontro ningun Afiliado");
        }

    }


}
