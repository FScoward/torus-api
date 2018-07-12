package fscoward.torus.domain.user

import fscoward.torus.domain.base.Id

case class User(id: Id[User], name: String)