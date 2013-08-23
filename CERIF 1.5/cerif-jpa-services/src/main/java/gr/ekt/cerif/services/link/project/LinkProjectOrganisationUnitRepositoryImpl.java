package gr.ekt.cerif.services.link.project;

import gr.ekt.cerif.entities.base.OrganisationUnit;
import gr.ekt.cerif.entities.base.Project;
import gr.ekt.cerif.entities.link.project.Project_OrganisationUnit;
import gr.ekt.cerif.features.semantics.Class;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class LinkProjectOrganisationUnitRepositoryImpl implements LinkProjectOrganisationUnitRepository {

	@Autowired
	private LinkProjectOrganisationUnitCrudRepository linkProjectOrganisationUnitCrudRepository;
	
	public Project_OrganisationUnit findByProjectAndOrganisationUnit(Project project, OrganisationUnit organisationUnit) {
		return linkProjectOrganisationUnitCrudRepository.findByProjectAndOrganisationUnit(project, organisationUnit);
	}

	public List<Project_OrganisationUnit> findByOrganisationUnit(OrganisationUnit organisationUnit) {
		return linkProjectOrganisationUnitCrudRepository.findByOrganisationUnit(organisationUnit);
	}

	public List<Project_OrganisationUnit> findByProjectAndTheClass(Project project, Class theClass) {
		return linkProjectOrganisationUnitCrudRepository.findByProjectAndTheClass(project, theClass);
	}
	
	public List<Project_OrganisationUnit> findByProject(Project project) {
		return linkProjectOrganisationUnitCrudRepository.findByProject(project);
	}
	
	public List <Project_OrganisationUnit> findByOrganisationUnitAndTheClass(OrganisationUnit organisationUnit, Class theClass) {
		return linkProjectOrganisationUnitCrudRepository.findByOrganisationUnitAndTheClass(organisationUnit, theClass);
	}
	
	@Transactional
	public Project_OrganisationUnit save(Project_OrganisationUnit entity) {
		return linkProjectOrganisationUnitCrudRepository.save(entity);
	}

	@Transactional
	public Iterable<? extends Project_OrganisationUnit> save(Iterable<? extends Project_OrganisationUnit> entities) {
		return linkProjectOrganisationUnitCrudRepository.save(entities);
	}

	@Transactional
	public void delete(Project_OrganisationUnit entity) {
		linkProjectOrganisationUnitCrudRepository.delete(entity);
	}

	@Transactional
	public void delete(Iterable<? extends Project_OrganisationUnit> entities) {
		linkProjectOrganisationUnitCrudRepository.delete(entities);
	}
	
}
