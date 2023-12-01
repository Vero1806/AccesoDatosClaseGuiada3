package org.example;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.ArrayList;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name="dim_language")
public class Dim_Language {
    // Se definen las variables de la clase
    private String LanguageCode;
    private String Language;
    private LocalDateTime created_dt;
    private LocalDateTime updated_dt;
    private List<Dim_Language> languages = new ArrayList<Dim_Language>();

    // Se definen los métodos get
    public String getLanguageCode() {
        return LanguageCode;
    }

    public String getLanguage() {
        return Language;
    }

    public LocalDateTime getCreated_dt() {
        return created_dt;
    }

    public LocalDateTime getUpdated_dt() {
        return updated_dt;
    }

    public List<Dim_Language> getLanguages() {
        return languages;
    }

    // Se definen los métodos set
    public void setLanguageCode(String languageCode) {
        LanguageCode = languageCode;
    }

    public void setLanguage(String language) {
        Language = language;
    }

    public void setCreated_dt(LocalDateTime created_dt) {
        this.created_dt = created_dt;
    }

    public void setUpdated_dt(LocalDateTime updated_dt) {
        this.updated_dt = updated_dt;
    }

    public void setLanguages(List<Dim_Language> languages) {
        this.languages = languages;
    }
}
