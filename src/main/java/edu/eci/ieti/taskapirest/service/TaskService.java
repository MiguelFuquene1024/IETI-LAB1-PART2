/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.ieti.taskapirest.service;

import edu.eci.ieti.taskapirest.data.Task;
import java.util.List;

/**
 *
 * @author Miguel
 */
public interface TaskService {
    Task create( Task task );

        Task findById( String id );
        
        List<Task> all();

        void deleteById( String id );

        Task update( Task task, String id );
}
