package edu.resoto.saz.Admin.domain.Authentication.gen;

import edu.resoto.saz.Admin.domain.Authentication.Role;
import java.util.List;

public interface PersonGen {

    long getId();

    void setId(long id);

    String getName();

    void setName(String name);

    String getGuid();

    void setGuid(String guid);

    List<Role> getRoles();

    void setRoles(List<Role> roles);
}