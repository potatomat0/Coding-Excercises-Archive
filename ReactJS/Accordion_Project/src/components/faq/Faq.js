import React from 'react'
import { MdOutlineLibraryBooks, MdQuestionAnswer } from 'react-icons/md';
import Question from './Question.js'
import {questions} from './data.js'
const Faq = _ => {
    return (
            <section className="faq-sec --center-all">
                <div className="container faq">
                    <div className="title">
                        <MdOutlineLibraryBooks size={30} color="orangered" /> 
                        <h2 className="--mb2">FAQS</h2>
                        <p> Lorem amongus </p>
                    </div>
                </div>

                <div className="questions">
                    {questions.map(question => <Question key={question.id} title = {question.title}
                                                          answer={question.answer}/>
                    )}
                </div>
            </section>        
    )
}

export default Faq