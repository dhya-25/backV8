package com.arabsoft.ajir.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.arabsoft.ajir.entities.CleLigCession;
import com.arabsoft.ajir.entities.Personnel;

@Repository
	
public interface PersonnelRep extends JpaRepository<Personnel, CleLigCession>{
	
	@Query(value="  select cod_soc            ,\r\n"
			+ "  mat_pers          ,\r\n"
			+ "  nom_pers          ,\r\n"
			+ "  pren_pers         ,\r\n"
			+ "  nom_pers_a        ,\r\n"
			+ "  pren_pers_a       ,\r\n"
			+ "  nom_jf            ,\r\n"
			+ "  nom_jf_a          ,\r\n"
			+ "  cin               ,\r\n"
			+ "  sexe              ,\r\n"
			+ "  cod_sit           ,\r\n"
			+ "  dat_sit           ,\r\n"
			+ "  chef_fam          ,\r\n"
			+ "  nbre_enf          ,\r\n"
			+ "  charg_enf         ,\r\n"
			+ "  charg_all         ,\r\n"
			+ "  fct_fam           ,\r\n"
			+ "  dat_ent           ,\r\n"
			+ "  dat_tit           ,\r\n"
			+ "  cod_serv          ,\r\n"
			+ "  cod_fonct         ,\r\n"
			+ "  cod_categ         ,\r\n"
			+ "  cod_cat           ,\r\n"
			+ "  cod_grad          ,\r\n"
			+ "  cod_motif         ,\r\n"
			+ "  cod_natp          ,\r\n"
			+ "  cod_stat          ,\r\n"
			+ "  dat_serv          ,\r\n"
			+ "  dat_fonct         ,\r\n"
			+ "  dat_qualf         ,\r\n"
			+ "  dat_categ         ,\r\n"
			+ "  dat_cat           ,\r\n"
			+ "  dat_grad          ,\r\n"
			+ "  dat_ech           ,\r\n"
			+ "  dat_emb           ,\r\n"
			+ "  dat_motif         ,\r\n"
			+ "  dat_nais          ,\r\n"
			+ "  etat_act          ,\r\n"
			+ "  per_mat_pers      ,\r\n"
			+ "  qualf             ,\r\n"
			+ "  cod_ech           ,\r\n"
			+ "  cod_affect        ,\r\n"
			+ "  cod_niveau        ,\r\n"
			+ "  poste_trav        ,\r\n"
			+ "  cod_metier        ,\r\n"
			+ "  cod_user          ,\r\n"
			+ "  dat_maj           ,\r\n"
			+ "  adm_tech          ,\r\n"
			+ "  dat_stat          ,\r\n"
			+ "  dat_cin           ,\r\n"
			+ "  lie_emi_cin       ,\r\n"
			+ "  dat_affect        ,\r\n"
			+ "  lieu_nais         ,\r\n"
			+ "  cod_lieu_geog     ,\r\n"
			+ "  dat_lieu_geog     ,\r\n"
			+ "  grp_sang          ,\r\n"
			+ "  num_retr          ,\r\n"
			+ "  cod_fil           ,\r\n"
			+ "  dat_fil           ,\r\n"
			+ "  serv_mil          ,\r\n"
			+ "  code_domaine      ,\r\n"
			+ "  cod_ur            ,\r\n"
			+ "  cod_class         ,\r\n"
			+ "  dat_class         ,\r\n"
			+ "  cod_typ_depart    ,\r\n"
			+ "  dat_depart        ,\r\n"
			+ "  dat_ur            ,\r\n"
			+ "  org_serv          ,\r\n"
			+ "  dat_poste_trav    ,\r\n"
			+ "  cod_nat_recr      ,\r\n"
			+ "  dat_adm_tech      ,\r\n"
			+ "  dat_org_serv      ,\r\n"
			+ "  maintien_pers     ,\r\n"
			+ "  maintien_date     ,\r\n"
			+ "  typ_rang          ,\r\n"
			+ "  handicap          ,\r\n"
			+ "  pourcent_hand     ,\r\n"
			+ "  typ_handicap      ,\r\n"
			+ "  num_fich_hand     ,\r\n"
			+ "  niv_sal           ,\r\n"
			+ "  cod_assur         ,\r\n"
			+ "  num_assur         ,\r\n"
			+ "  cod_retr          ,\r\n"
			+ "  typ_id            ,\r\n"
			+ "  etat_sante        ,\r\n"
			+ "  dat_eff_fich_hand ,\r\n"
			+ "  dat_fin_fich_hand ,\r\n"
			+ "  ref_fonct         ,\r\n"
			+ "  nat_texte_fonct   ,\r\n"
			+ "  nouv_dat_ech      ,\r\n"
			+ "  dat_niv_sal       ,\r\n"
			+ "  dat_ass           ,\r\n"
			+ "  dat_aff_cnam      ,\r\n"
			+ "  etat_poste_trav   ,\r\n"
			+ "  dat_fin_cont      ,\r\n"
			+ "  presum_nais       ,\r\n"
			+ "  cod_fill          ,\r\n"
			+ "  suspens_ass       ,\r\n"
			+ "  cod_motif_susp    ,\r\n"
			+ "  dat_fin_suspens   ,\r\n"
			+ "  dat_deb_suspens   ,\r\n"
			+ "  chronique         ,\r\n"
			+ "  cod_cat_class     ,\r\n"
			+ "  cod_gouv          ,\r\n"
			+ "  cod_loc           ,\r\n"
			+ "  num_ass_gat       ,\r\n"
			+ "  num_acc           ,\r\n"
			+ "  categ_emb         ,\r\n"
			+ "  cat_emb           ,\r\n"
			+ "  grad_emb          ,\r\n"
			+ "  ech_emb           ,\r\n"
			+ "  id_personnel      ,\r\n"
			+ "  lieu_nais_a       ,\r\n"
			+ "  benef_allf        ,\r\n"
			+ "  cod_dir           ,\r\n"
			+ "  cod_uf            ,\r\n"
			+ "  lib_adm_tech      ,\r\n"
			+ "  lib_affect        ,\r\n"
			+ "  lib_cat           ,\r\n"
			+ "  lib_categ         ,\r\n"
			+ "  lib_class         ,\r\n"
			+ "  lib_cod_metier    ,\r\n"
			+ "  lib_domaine       ,\r\n"
			+ "  lib_etat_act      ,\r\n"
			+ "  lib_fil           ,\r\n"
			+ "  lib_fonct         ,\r\n"
			+ "  lib_gouv          ,\r\n"
			+ "  lib_grad          ,\r\n"
			+ "  lib_motif         ,\r\n"
			+ "  lib_niveau        ,\r\n"
			+ "  lib_poste_trav    ,\r\n"
			+ "  lib_serv          \r\n"
			+ "  from PERSONNEL"
			+ "  where cod_soc = :codSoc and mat_pers = :matPers",nativeQuery=true)
	public List<Personnel> getPers(@Param("codSoc") String codSoc,@Param("matPers") String matPers);
	
	
	@Query(value="select  cod_soc,\r\n"
			+ "    mat_pers,\r\n"
			+ "    nom_pers,\r\n"
			+ "    pren_pers,\r\n"
			+ "    nom_pers_a,\r\n"
			+ "    pren_pers_a,\r\n"
			+ "    nom_jf,\r\n"
			+ "    nom_jf_a,\r\n"
			+ "    cin,\r\n"
			+ "    sexe,\r\n"
			+ "    cod_sit,\r\n"
			+ "    dat_sit,\r\n"
			+ "    chef_fam,\r\n"
			+ "    nbre_enf,\r\n"
			+ "    charg_enf,\r\n"
			+ "    charg_all,\r\n"
			+ "    fct_fam,\r\n"
			+ "    dat_ent,\r\n"
			+ "    dat_tit,\r\n"
			+ "    cod_serv,\r\n"
			+ "    (pk_get_lib.GET_SERVICE$LIB_SERV(cod_soc,cod_serv)) lib_serv,\r\n"
			+ "    cod_fonct,\r\n"
			+ "    (pk_get_lib.GET_FONCTIONS$LIB_FONCT(cod_fonct,'F')) lib_fonct,\r\n"
			+ "    cod_categ,\r\n"
			+ "    (pk_get_lib.GET_CATEG$LIB_CATEG(cod_categ)) lib_categ,\r\n"
			+ "    cod_cat,\r\n"
			+ "    (pk_get_lib.GET_CATEGORIE$LIB_CAT(cod_categ,cod_cat)) lib_cat,\r\n"
			+ "    cod_grad,\r\n"
			+ "    (pk_get_lib.GET_GRADE$LIB_GRAD(cod_categ,cod_cat,cod_grad)) lib_grad,\r\n"
			+ "    cod_motif,\r\n"
			+ "    (pk_get_lib.GET_MOTIF_SORT$LIB_MOTIF(cod_motif)) lib_motif,\r\n"
			+ "    cod_natp,\r\n"
			+ "    cod_stat,\r\n"
			+ "    dat_serv,\r\n"
			+ "    dat_fonct,\r\n"
			+ "    dat_qualf,\r\n"
			+ "    dat_categ,\r\n"
			+ "    dat_cat,\r\n"
			+ "    dat_grad,\r\n"
			+ "    dat_ech,\r\n"
			+ "    dat_emb,\r\n"
			+ "    dat_motif,\r\n"
			+ "    dat_nais,\r\n"
			+ "    etat_act,\r\n"
			+ "    (pk_get_lib.GET_ETAT_PAIE$LIB_ETAT(etat_act)) lib_etat_act,\r\n"
			+ "    qualf,\r\n"
			+ "    cod_ech,\r\n"
			+ "    cod_affect,\r\n"
			+ "    (pk_get_lib.GET_AFFECTATIO$LIB_AFFECT(cod_affect)) lib_affect,\r\n"
			+ "    cod_niveau,\r\n"
			+ "    (pk_get_lib.GET_PARAM_NIVE$LIB_NIVEAU(cod_niveau))lib_niveau,\r\n"
			+ "    poste_trav,\r\n"
			+ "    (pk_get_lib.GET_POSTE_TRAV$LIB_POST(poste_trav)) lib_poste_trav,\r\n"
			+ "    cod_metier,\r\n"
			+ "    (pk_get_lib.GET_METIER$LIB_METIER(cod_metier)) lib_cod_metier,\r\n"
			+ "    adm_tech,\r\n"
			+ "    (pk_get_lib.GET_TYP_ADM_TE$LIB_ADM_TECH(adm_tech)) lib_adm_tech,\r\n"
			+ "    dat_stat,\r\n"
			+ "    dat_cin,\r\n"
			+ "    lie_emi_cin,\r\n"
			+ "    dat_affect,\r\n"
			+ "    lieu_nais,\r\n"
			+ "    cod_lieu_geog,\r\n"
			+ "    (pk_get_lib.GET_PRM_LIEU_G$LIB_LIEU(cod_lieu_geog)) lib_lieu_geog,\r\n"
			+ "    dat_lieu_geog,\r\n"
			+ "    grp_sang,\r\n"
			+ "    num_retr,\r\n"
			+ "    cod_fil,\r\n"
			+ "    (pk_get_lib.GET_FILLIERE$LIB_FIL(cod_fil)) lib_fil,\r\n"
			+ "    dat_fil,\r\n"
			+ "    serv_mil,\r\n"
			+ "    (pk_get_lib.GET_PRM_MILITA$LIB_MIL(serv_mil)) lib_mil,\r\n"
			+ "    code_domaine,\r\n"
			+ "    (pk_get_lib.GET_LISTE_DOMA$LIB_DOMAINE(code_domaine)) lib_domaine,\r\n"
			+ "    cod_class,\r\n"
			+ "    (pk_get_lib.GET_CLASSE_ADM$LIB_CLASS(cod_class)) lib_class,\r\n"
			+ "    dat_class,\r\n"
			+ "    cod_typ_depart,\r\n"
			+ "    dat_depart,\r\n"
			+ "    org_serv,\r\n"
			+ "    dat_poste_trav,\r\n"
			+ "    cod_nat_recr,\r\n"
			+ "    dat_adm_tech,\r\n"
			+ "    dat_org_serv,\r\n"
			+ "    typ_rang,\r\n"
			+ "    handicap,\r\n"
			+ "    pourcent_hand,\r\n"
			+ "    typ_handicap,\r\n"
			+ "    num_fich_hand,\r\n"
			+ "    niv_sal,\r\n"
			+ "    cod_assur,\r\n"
			+ "    num_assur,\r\n"
			+ "    typ_id,\r\n"
			+ "    dat_eff_fich_hand,\r\n"
			+ "    dat_fin_fich_hand,\r\n"
			+ "    dat_niv_sal,\r\n"
			+ "    presum_nais,\r\n"
			+ "    cod_gouv,\r\n"
			+ "    (pk_get_lib.GET_GOUVERNORA$LIB_GOUV(cod_gouv)) lib_gouv,\r\n"
			+ "    benef_allf,\r\n"
			+ "    num_acc,\r\n"
			+ "    id_personnel\r\n"
			+ "From personnel \r\n"
			+ "where cod_soc = :codSoc and mat_pers = :matPers",nativeQuery = true)
	public Personnel getPersonnel(@Param("codSoc") String codSoc,@Param("matPers") String matPers);

	@Query(value="select p.mat_pers from personnel p where"
			+ " (get_pere_by_pere(cod_soc,cod_serv,:serCodSer)=:serCodSer or mat_pers=:matPers) \n"
			+ "	and :matPers =(select mat_pers from service where cod_serv=:serCodSer)",nativeQuery = true)
	public List<String> getMatChef(@Param("matPers") String mat,@Param("serCodSer") String codSer);
	//select mat_pers from personnel where (get_pere_by_pere(cod_soc,cod_serv,'1F0')='1F0' or mat_pers='10326') 
	//and '10326'=(select mat_pers from service where cod_serv='1F0')
}
