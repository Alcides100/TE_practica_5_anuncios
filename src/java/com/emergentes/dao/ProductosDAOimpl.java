

package com.emergentes.dao;

import com.emergentes.modelo.Productos;
import com.emergentes.utiles.ConexionBD;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ProductosDAOimpl extends ConexionBD implements ProductosDAO{

    @Override
    public void insert(Productos producto) throws Exception {
          
        try {
            this.conectar();
            String sql = "INSERT into productos (descripcion,stock) values (?,?)";
            PreparedStatement ps = this.conn.prepareStatement(sql);
            ps.setString(1, producto.getDescripcion());
            ps.setString(2, producto.getStock());
            //ejecutamos la consulta
            ps.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally {
            this.desconectar();
        }
    }

    @Override
    public void update(Productos producto) throws Exception {
        System.out.println("llego aqui alci");
         try {
            this.conectar();
            String sql = "UPDATE productos set descripcion=?, stock=? where id = ?";
            PreparedStatement ps = this.conn.prepareStatement(sql);
            ps.setString(1, producto.getDescripcion());
            ps.setString(2, producto.getStock());
            ps.setInt(3, producto.getId());
            //ejecutamos la consulta
            ps.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally {
            this.desconectar();
        }
    }

    @Override
    public void delete(int id) throws Exception {
       
         try {
            this.conectar();
            String sql = "DELETE from productos where id = ?";
            PreparedStatement ps = this.conn.prepareStatement(sql);
            ps.setInt(1, id);
            //ejecutamos la consulta
            ps.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally {
            this.desconectar();
        }
    }

    @Override
    public Productos getById(int id) throws Exception {
       
            Productos pro = new Productos();
        try {
            this.conectar();
            String sql = "SELECT * from productos where id = ?";
            PreparedStatement ps = this.conn.prepareStatement(sql);
            ps.setInt(1, id);
            //ejecutamos la consulta
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                pro.setId(rs.getInt("id"));
                pro.setDescripcion(rs.getString("descripcion"));
                pro.setStock(rs.getString("stock"));
            }
        } catch (Exception e) {
            throw e;
        } finally {
            this.desconectar();
        }
        return pro;
    }

    @Override
    public List<Productos> getAll() throws Exception {
        
        List<Productos> lista = null;
        try {
            this.conectar();
            String sql = "SELECT * from productos";
            PreparedStatement ps = this.conn.prepareStatement(sql);
            //ejecutamos la consulta
            ResultSet rs = ps.executeQuery();
            lista = new ArrayList<Productos>();
            while (rs.next()) {
                Productos pro = new Productos();
                pro.setId(rs.getInt("id"));
                pro.setDescripcion(rs.getString("descripcion"));
                pro.setStock(rs.getString("stock"));
                //Adicionar ala coleccion
                lista.add(pro);
            }
        } catch (Exception e) {
            throw e;
        } finally {
            this.desconectar();
        }
        return lista;
    }
    
}
