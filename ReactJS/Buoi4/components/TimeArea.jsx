import React from 'react'
export default function TimeArea() {
    return <h5> The current time is {new Date().toLocaleTimeString()} ⌚ </h5> 
}