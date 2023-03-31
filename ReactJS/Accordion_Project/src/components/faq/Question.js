import React from 'react'
import { useState } from 'react'
import { AiOutlineMinus, AiOutlinePlus} from 'react-icons/ai'
import './Question.scss'

const Question = ({title, answer}) => {
    // var showAnswer = false
    const [showAnswer, setShowAnswer] = useState(false)
    
    const handleClick= _ => {setShowAnswer(!showAnswer)}

    return (
        <div className="container question --card">
            <div className="question-title --flex-between">
                <h4 className='--text-p fw-bold'>
                    {title}
                </h4>
                <button onClick={handleClick} className="question-icon">
                    {
                        showAnswer? (<AiOutlineMinus color='red'/>) : 
                                    (<AiOutlinePlus color='powderblue'/>)
                    }   
                </button>
            </div> 

            <div className="question-answer">
                {showAnswer && <p className='--text-sm --py'>
                    {answer}
                </p>}
            </div>
        </div>
    )
}

export default Question