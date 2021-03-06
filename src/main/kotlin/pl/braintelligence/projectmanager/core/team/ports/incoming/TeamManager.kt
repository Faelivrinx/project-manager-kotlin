package pl.braintelligence.projectmanager.core.team.ports.incoming

import pl.braintelligence.projectmanager.infrastructure.adapter.incoming.rest.dto.NewTeam
import pl.braintelligence.projectmanager.infrastructure.adapter.incoming.rest.dto.TeamMember
import pl.braintelligence.projectmanager.core.team.domain.Team

/**
 * Primary Port
 */

interface TeamManager {

    fun createTeam(newTeam: NewTeam)

    fun addMemberToTeam(teamName: String, teamMember: TeamMember)

    fun getTeams(): List<Team>

    fun getTeam(teamName: String): Team

}
