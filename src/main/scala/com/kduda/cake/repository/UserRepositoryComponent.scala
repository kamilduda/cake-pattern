package com.kduda.cake.repository
import com.kduda.cake.common.User

trait UserRepositoryComponent {
  def userLocator: UserLocator

  def userUpdater: UserUpdater

  trait UserLocator {
    def findAll: List[User]
  }

  trait UserUpdater {
    def save(user: User)
  }

}
