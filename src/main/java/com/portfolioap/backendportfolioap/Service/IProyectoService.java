package com.portfolioap.backendportfolioap.Service;

import com.portfolioap.backendportfolioap.Entity.Proyecto;
import java.util.List;

public interface IProyectoService {

    public void saveProyecto(Proyecto proyecto);

    public void deleteProyecto(int id);

    public List<Proyecto> traerProyectos();

    public Proyecto traerProyectoPorId(int id);

}
