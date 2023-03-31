import React from 'react'

export class Pet extends React.Component   {
  render() {
    return (
        <li> {this.props.name} is a {this.props.species} and is {this.props.age} years old </li>
    )
  }
}

