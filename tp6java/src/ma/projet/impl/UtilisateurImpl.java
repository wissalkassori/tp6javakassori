
package ma.projet.impl;

import ma.projet.bean.Profil;
import ma.projet.dao.Dao;
import java.util.ArrayList;
import java.util.List;

class ProfilesImpl implements Dao<Profil> {
    private List<Profil> profiles = new ArrayList<>();

    public boolean create(Profil obj) { return profiles.add(obj); }
    public boolean delete(Profil obj) { return profiles.remove(obj); }
    public boolean update(Profil obj) { return true; }
    public Profil getById(int id) { return profiles.stream().filter(p -> p.getById().equals(id)).findFirst().orElse(null); }
    public List<Profil> getAll() { return profiles; }
}
