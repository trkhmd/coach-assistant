import * as React from 'react';
import Box from '@mui/material/Box';
import TextField from '@mui/material/TextField';
import Container from "@mui/material/Container";
import {Paper} from "@mui/material";
import {useState} from "react";
import Button from "@mui/material/Button";

export default function Player() {
    const paperStyle={padding:'50px 20px', width:600,margin:'20px auto' }
    const[firstName,setFirstName]=useState('')
    const[lastName,setLastname]=useState('')
    const[age,setAge]=useState('')
    const[position,setPoste]=useState('')
    const[team,setEquipe]=useState('')
    const[number,setNumber]=useState('')
    const[comments,setComment]=useState('')
    const[stats,setStats]=useState(Object)

    const handleClick=(e)=>{
        e.preventDefault()
        const player = {firstName,lastName,age,position,team,number,comments,stats}
        fetch("http://localhost:8080/v1/player/add",{method:"POST",headers:{"Content-Type":"application/json","Access-Control-Allow-Origin": "*","Access-Control-Allow-Headers": '*'},
        body:JSON.stringify(player)
        }).then(()=>{
            console.log("new player added")
            }
        )

        console.log(player)
    }
    return (
        <Container>
            <Paper elevation={3} style={paperStyle}>
        <Box
            component="form"
            sx={{
                '& > :not(style)': { m: 1, width: '25ch' },
            }}
            noValidate
            autoComplete="off"
        >
            <TextField id="standard-basic" label="Prenom" variant="standard" fullWidth
            value={firstName}
            onChange={(e)=>setFirstName(e.target.value)}
            />
            <TextField id="standard-basic" label="Nom" variant="standard" fullWidth
                       value={lastName}
                       onChange={(e)=>setLastname(e.target.value)}/>
            <TextField id="standard-basic" label="Age" variant="standard" fullWidth
                       value={age}
                       onChange={(e)=>setAge(e.target.value)}/>
            <TextField id="standard-basic" label="Poste" variant="standard" fullWidth
                       value={position}
                       onChange={(e)=>setPoste(e.target.value)}/>
            <TextField id="standard-basic" label="Equipe" variant="standard" fullWidth
                       value={team}
                       onChange={(e)=>setEquipe(e.target.value)}/>
            <TextField id="standard-basic" label="Numero" variant="standard" fullWidth
                       value={number}
                       onChange={(e)=>setNumber(e.target.value)}/>
            <TextField
                id="outlined-multiline-flexible"
                label="Commentaire"
                multiline
                rowsMax="4"
                variant="standard"
                value={comments}
                onChange={(e)=>setComment(e.target.value)}
            />
            <Button variant="outlined" onClick={handleClick}>Valider</Button>


        </Box>
            </Paper>
        </Container>
    );
}
