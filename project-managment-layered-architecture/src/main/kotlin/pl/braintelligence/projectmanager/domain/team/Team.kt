package pl.braintelligence.projectmanager.domain.team

import org.apache.commons.lang3.StringUtils.isBlank
import pl.braintelligence.projectmanager.domain.exceptions.InvalidTeamException
import pl.braintelligence.projectmanager.domain.exceptions.ErrorCode.*
import pl.braintelligence.projectmanager.domain.values.Employee

data class Team(
    val name: String,
    val currentlyImplementedProjects: Int = 0,
    var members: MutableList<Employee> = mutableListOf()
) {
    init {
        validateName(name)
    }

    fun addMember(teamMember: Employee) {
        validateMember(teamMember)
        members.add(teamMember)
    }

    private fun validateName(name: String) {
        when (isBlank(name)) {
            true -> throw InvalidTeamException(EMPTY_TEAM_NAME)
        }
    }

    private fun validateMember(teamMember: Employee) {
        teamMember.hasNoFirstName()
    }
}

