import { createStore, applyMiddleware, combineReducers } from 'redux'
import thunk from 'redux-thunk'
// import rootReducer from './reducers'

const initialState = {};
const middleware = [thunk];
const store = createStore(combineReducers({}), initialState, applyMiddleware(...middleware))
export default store;