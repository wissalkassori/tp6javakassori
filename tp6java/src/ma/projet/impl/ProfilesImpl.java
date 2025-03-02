package ma.projet.impl;

import java.util.ArrayList;
import java.util.List;
import ma.projet.bean.Profil;
import ma.projet.dao.Dao;

public class ProfilesImpl implements Dao<Profil> {
    private List<Profil> profiles = new ArrayList<>();

    public boolean create(Profil obj) { return profiles.add(obj); }
    public boolean delete(Profil obj) { return profiles.remove(obj); }
    public boolean update(Profil obj) { return true; }
    public Profil getById(int id) { return profiles.stream().filter(p -> ((Profil) p).getLibelle().equals(id)).findFirst().orElse(null); }
    public List<Profil> getAll() { return profiles; }
}