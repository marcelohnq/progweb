
package br.com.business;

import br.com.Dao.DaoFactory;
import br.com.Dao.GenericDao;
import br.com.Dao.PermissionDao;
import br.com.model.Permission;

import java.util.ArrayList;

/**
 *
 * @author Vitor Mesaque
 */
public class PermissionBO
{
        
    public void save(ArrayList<Permission> permissions )
    {
        PermissionDao permissionDao= DaoFactory.getDaoFactory().getPermissionDao();
       
        permissionDao.save(permissions);
    }
    public ArrayList<Permission> getAllPermissions()
    {
        PermissionDao permissionDao = DaoFactory.getDaoFactory().getPermissionDao();
       
        return permissionDao.list();
    }
    
    public ArrayList<Permission> getProfilePermissions(int profile)
    {
        PermissionDao permissionDao = DaoFactory.getDaoFactory().getPermissionDao();
       
        return permissionDao.profilePermissions(profile);
    }    

}
